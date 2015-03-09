(ns webapp.views.home-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]
   [webapp.views.sections :as views]))

(defn home-page []
  [:div.container
   (nav-bar "")
   (views/contact-element)
   (views/about-element)
   (views/personalproject-element)
   (views/workexp-element)
   (views/education-element)])
