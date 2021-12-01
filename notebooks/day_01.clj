;; # Advent of Code - Day 01

(ns day-01
  (:require [clojure.string :as str]))

;; # Utility functions

(defn read-data
  [path]
  (->> path
    slurp
    str/split-lines
    (map #(read-string %))))

(defn number-of-increases
  "Find increases in a sequence of integers"
  [depths]
  (let [indexes (->> depths count range drop-last)]
    (->> (for [index indexes]
           (<
             (nth depths index)
             (nth depths (inc index))))
      (filter true?)
      count)))

;; # Working on the sample data

(def sample-depths (read-data "data/day01_sample.txt"))

(number-of-increases sample-depths)

;; # Working on the final data

(def depths (read-data "data/day01.txt"))

(number-of-increases depths)

