(ns webapp.views.about-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]))

(defn about-page []
  [:div.container
   (nav-bar "about")
   [:div.header
    [:h2 "About mh-resume"]]
   [:div.aboutdesc.jumbotron
    [:p "mobile friendly resume realized using reagent / clojurescript."]
    [:div [:a {:href "#/"} "go to home page"]]]])


