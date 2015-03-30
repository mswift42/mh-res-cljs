(ns webapp.views.nav-bar)

(defn nav-bar [active]
  [:nav.navbar.navbar-default.navbar-fixed-top {:role "navigation"}
   [:div.container-fluid
    [:div.navbar-header
     [:a.navbar-brand {:href "/#"} "Resume"]
     [:button.navbar-toggle.collapsed {:data-target "#navbar" :data-toggle "collapse"
                                       :aria-expanded "false" :aria-controls "navbar"}
      [:span.sr-only "Toggle navigation"]
      [:span.icon-bar]
      [:span.icon-bar]
      [:span.icon-bar]]]
    [:div.navbar-collapse.collapse {:id "navbar"}
     (if (= active "about")
       [:ul.nav.navbar-nav
        [:li
         [:a {:href "#/"} "Home"]]
        [:li.active
         [:a {:href "#/about"} "About"]]]
       [:ul.nav.navbar-nav
        [:li.active
         [:a {:href "#/"} "Home"]]
        [:li
         [:a {:href "#/about"} "About"]]])]]])
