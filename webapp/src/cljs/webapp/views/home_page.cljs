(ns webapp.views.home-page
  (:require
   [webapp.views.sections :as views]))

(defn home-page []
  [:div.maincontainer
   [:div.ressection {:id "contact"}
    (views/contact-element)]
   [:div.ressection {:id "about"}
    (views/about-element)]
   [:div.ressection {:id "projects"}
    (views/personalproject-element)]
   [:div.ressection {:id "work"}
    (views/workexp-element)]
   [:div.ressection {:id "education"}
    (views/education-element)]
   [:div.ressection {:id "awards"}
    (views/awards-element)]
   [:div.ressection {:id "skills"}
    (views/skill-element)]])
