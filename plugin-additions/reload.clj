(ns reload
  (:require [ccw.e4.dsl :refer :all]
            [ccw.eclipse :as e]
            [ccw.core.user-plugins :as p]))

(defn reload [context]
  (try
    (p/start-user-plugins)
    (e/error-dialog "User plugins"
      "User plugins have been restarted successfully!")
    (catch Exception e
      (e/error-dialog"User plugins" (str
        "An error occured while starting User plugins: \n"
        (.getMessage e))))))

(defcommand start-user-plugins "Start/restart user plugins")
(defhandler start-user-plugins reload)
(defkeybinding start-user-plugins "Alt+U S")
