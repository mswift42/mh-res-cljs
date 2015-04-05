(ns webapp.views.home-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]
   [webapp.views.sections :as views]))

(defn home-page []
  [:div.maincontainer
   (nav-bar "")
   [:div.ressection.container-fluid
    (views/contact-element)]
   [:div.ressection.container-fluid
    (views/about-element)]
   [:div.ressection.container-fluid
    (views/personalproject-element)]
   [:div.ressection.container-fluid
    (views/metalslide)]
   [:div.ressection.container-fluid
    (views/workexp-element)]
   [:div.ressection.container-fluid
    (views/education-element)]
   [:div.ressection.container-fluid
    (views/awards-element)]
   [:div.ressection.container-fluid
    (views/skill-element)]])
