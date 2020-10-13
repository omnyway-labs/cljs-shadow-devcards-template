;; as per https://github.com/bhauman/devcards/issues/168#issuecomment-707489078
(ns cljsjs.highlight
  (:require ["highlight.js" :as hljs]))

(js/goog.exportSymbol "hljs" hljs)
(js/goog.exportSymbol "DevcardsSyntaxHighlighter" hljs)
