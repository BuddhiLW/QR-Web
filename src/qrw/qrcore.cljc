(ns giggin.qrcore
  #?(:cljs (:require math.seedrandom
                      [cljs.core :as lang]))
  #?@(:clj [(:require
             [com.nopolabs.clozxing.encode :as encode]
             [com.nopolabs.clozxing.decore :as decode])])
  (:require [clojure.core :as lang])
  (:import java.util.Random)
  (:refer-clojure :exclude (double float int long boolean)))

(encode/to-file
 "https://www.buddhilw.com/pages-output/web-dev/"
 "qr-test.png"
 {:size 200
  :logo "resources/logo.jpeg"
  :logo-size 67
  :error-correction encode/error-correction-H
  :character-set encode/iso-8859-1
  :margin 1
  :format "PNG"})
