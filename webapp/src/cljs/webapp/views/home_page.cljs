(ns webapp.views.home-page)

(defn home-page []
  [:div.container
   [:h2 "home-page"]
   [:a {:href "#/about"} "go to about page"]])
