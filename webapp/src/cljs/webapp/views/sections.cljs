(ns webapp.views.sections)

(defn contact-element []
  [:div.contact
   [:div.contactheader
    [:h3 "Martin Haesler"]]
   [:div.contactmail
    [:span "Email:"]
    [:span "martin.haesler@gmail.com"]]
   [:div.contactphone
    [:p "Phone"]
    [:p "07858 242169"]]])

(defn about-element []
  [:div.aboutelement
   [:h3 "About"]
   [:p "Martin Haesler is a former sales man for plumbing and heating projects, who after 17 years of working in this line of work, decided it was time for a change, see something of the world, and try for a completely different career path. Having always been interested in computer technology, an avid Linux user for many years, he decided on programming as a new career. Martin Haesler is quick to learn new things, self motivated and eager to improve."]])

(defn personal-projects []
  [
   {:name "MetalHead"
    :url  "https://github.com/mswift42/MetalHead"
    :pic "images/mh1.png"
    :summary "MetalHead is a old school text adventure written in Common Lisp. Every location and items in MetalHead's game world are instances of CLOS class definitions `loc` and `item`, which are inspired by infocom's Zork Implementation Language.The goal of the game is to attend a Metallica concert. This can be achieved by interacting in typical text adventure manner with items and people."}
   {:name "Theme Creator"
    :url "https://github.com/mswift42/theme-creator"
    :pic "images/screen1.png"
    :summary "Emacs Theme Creator helps you to create quickly color themes for Emacs24. It runs an Google's AppEngine, using Go as backend. The frontend uses AngularJS, because Emacs Theme Creator makes heavy use of two-way data binding, which is very easy to implement in AngularJS. Random colors are supported by using go-colorful's 3 palettes, soft, warm and happy, and the contrast can be adjusted using the chroma javascript library."}
   {:name "Beebster"
    :url "https://github.com/mswift42/go-beebster"
    :pic "images/pic1.png"
    :summary "go-beebster is a Web Gui frontend for <a href='https://github.com/get-iplayer/get-iplayer'>get-iplayer</a>. You can search for Iplayer programmes, either by name or category, see their description and download the programme. Beebster is implemented in Go, running the command line application get-iplayer in the background to search for the desired programme and info using regular expressions. It displays the results in the browser, showing a thumbnail and the programme's title. Downloading opens a gnome-terminal running the get-iplayer download command."}])

(defn personalproject-element []
  [:div.container
   [:h3 "Personal Projects"]
   (for [i (personal-projects)]
     [:div.persprojelement
      [:div.projheader
       [:h4 (:name i)]]
      [:div.projurl
       [:a {:href (:url i)} "github url"]]
      [:div.projimg
       [:img {:src (:pic i)}]]
      [:div.projsummary
       [:p (:summary i)]]])])      
