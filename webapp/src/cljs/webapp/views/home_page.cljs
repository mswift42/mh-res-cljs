(ns webapp.views.home-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]))

(defn home-page []
  [:div.container
   (nav-bar "")
   [:h2 "home-page"]
   [:a {:href "#/about"} "go to about page"]])
