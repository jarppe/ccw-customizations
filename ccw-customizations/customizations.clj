(require '[paredit.core :as p])
(alter-var-root
  #'p/lisp-forms
  conj "fact"  "midje.sweet/fact"
       "facts" "midje.sweet/facts")
(alter-var-root
  #'p/lisp-forms
  disj "->"  "clojure.core/->"
       "->>"  "clojure.core/->>")
