(ns webapp.views.nav-bar)

(defn nav-bar
  [active]
  [:div.off-canvas-wrap {:data-offcanvas ""}
   [:div.inner-wrap
    [:nav.tab-bar
     [:section.left-small
      [:a.left-off-canvas-toggle.menu-icon {:href "#"}
       [:span]]]
     [:section.middle.tab-bar-section
      [:h1.title "Resume"]]]
    [:aside.left-off-canvas-menu
     [:ul.off-canvas-list
      [:li
       [:label "Index"]]
      [:li
       [:a {:href "/#about"} ]]]]
    [:section.main-section
     [:h2 "Content Goes HERE"]]
    [:a.exit-off-canvas]]])
