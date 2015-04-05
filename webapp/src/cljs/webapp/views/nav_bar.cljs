(ns webapp.views.nav-bar)

(defn nav-bar [active]
  [:div.fixed
   [:nav.top-bar {:role "navigation" } 
    [:ul.title-area
     [:li.name
      [:h1
       [:a {:href "/#"} "Resume"]]]
     [:li.toggle-topbar.menu-icon
      [:a {:href "/#"}
       [:span "Menu"]]]
     
     ]
    [:section.top-bar-section
     (if (= active "about")
       [:ul.left
        [:li
         [:a {:href "#/"} "Home"]]
        [:li.active
         [:a {:href "#/about"} "About"]]]
       [:ul.nav.navbar-nav
        [:li.active
         [:a {:href "#/"} "Home"]]
        [:li
         [:a {:href "#/about"} "About"]]])]]])
