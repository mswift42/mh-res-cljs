(ns webapp.views.about-page)

(defn about-page []
  [:div.container
   [:div.header
    [:h2 "About mh-resume"]]
   [:div.aboutdesc
    [:p "mobile friendly resume realized using reagent / clojurescript."]
    [:div [:a {:href "#/"} "go to home page"]]]])
