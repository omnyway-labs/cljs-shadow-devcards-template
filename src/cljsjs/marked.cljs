;; as per https://github.com/bhauman/devcards/issues/168#issuecomment-707489078
(ns cljsjs.marked
  (:require ["marked" :as marked]))

(js/goog.exportSymbol "marked" marked)
(js/goog.exportSymbol "DevcardsMarked" marked)
