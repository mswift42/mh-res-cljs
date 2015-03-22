(ns webapp.views.home-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]
   [webapp.views.sections :as views]))

(defn home-page []
  [:div.container
   (nav-bar "")
   [:div.ressection
    (views/contact-element)]
   [:div.ressection
    (views/about-element)]
   [:div.ressection
    (views/personalproject-element)]
   [:div.ressection
    (views/metalslide)]
   [:div.ressection
    (views/workexp-element)]
   [:div.ressection
    (views/education-element)]
   [:div.ressection
    (views/awards-element)]
   [:div.ressection
    (views/skill-element)]])
