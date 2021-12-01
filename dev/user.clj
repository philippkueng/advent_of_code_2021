(ns user
  (:require [nextjournal.clerk :as clerk]))

;; start Clerk's buit-in webserver on the default port 7777, opening the browser when done
(clerk/serve! {:browse? true})

;; start with watcher and show filter function to enable notebook pinning
(clerk/serve! {:watch-paths ["notebooks"] :show-filter-fn #(clojure.string/starts-with? % "notebooks")})

;; either call `clerk/show!` explicitly
(clerk/show! "notebooks/days.clj")

;; or let Clerk watch the given `:paths` for changes
#_(clerk/serve! {:watch-paths ["notebooks" "src"]})

