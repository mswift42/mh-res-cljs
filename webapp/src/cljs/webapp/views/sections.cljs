(ns webapp.views.sections)

(defn contact-element []
  [:div.contact.hide-for-medium-up
   [:div.contactheader
    [:h3.sectionheader "Contact"]
    [:h6 "Martin Haesler"]]
   [:div.contactmail.row
    [:span.small-3.column "Email:"]
    [:span.small-7.column "martin.haesler@gmail.com"]]
   [:div.contactphone.row
    [:p.small-3.column "Phone"]
    [:p.small-7.column "07858 242169"]]]
  [:div.contactmed
   [:div.row
    [:div.medium-4.column.contactmedheader
     [:h3.text-center "Contact"]]
    [:div.medium-7.column.contactdetails
     [:div.contactmail.row
      [:h5.medium-offset-1.medium-2.column "Email: "]
      [:p.medium-6.column "martin.haesler@gmail.com"]]
     [:div.contactphone.row
      [:h5.medium-4.column.medphone "Phone:"]
      [:p.large-5.column.mednum "07858 242169"]]]]])

(defn about-element []
  [:div.aboutelement
   [:h3.sectionheader "About"]
   [:p "Martin Haesler is a former sales man for plumbing and heating projects, who after 17 years of working in this line of work, decided it was time for a change, see something of the world, and try for a completely different career path. Having always been interested in computer technology, an avid Linux user for many years, he decided on programming as a new career. Martin Haesler is quick to learn new things, self motivated and eager to improve."]])

(def personal-projects 
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
  [:div.projects
   [:div
    [:h3.sectionheader "Personal Projects"]]
   (for [i personal-projects]
     ^{:key i}
     [:div.persprojelement
      [:div.projheader
       [:h4 (:name i)]]
      [:div.projurl
       [:a {:href (:url i)} "github url"]]
      [:div.row
       [:div.small-10.small-centered-columns
        [:div.projimg
         [:img.thumb {:src (:pic i)}]]]]
      [:div.projsummary
       [:p (:summary i)]]])])

(defn bootcar
  "helper fn. Takes a map of images and captinos and returns a bootstrap 3
   carousel for each project."
  [projects]
  (let [[firstproj & restprojects] projects]
    [:div.carou
     [:div#projectcarousel {:class "carousel slide" :data-ride "carousel"}
      [:ol.carousel-indicators
       [:li.active {:data-target "#projectcarousel" :data-slide-to "0"}]
       [:lo {:data-target "#projectcarousel" :data-slide-to "1"}]]
      [:div.carousel-inner {:role "listbox"}
       [:div.item.active
        [:img {:src (:image firstproj)}]
        [:div.carousel-caption
         [:h3 (:caption firstproj)]]]
       (for [i restprojects]
         [:div.item
          [:img {:src (:image i)}]
          [:div.carousel-caption
           [:h3 (:caption i)]]])]
      [:a.left.carousel-control {:href "#projectcarousel" :role "button"
                                 :data-slide "prev"}
       [:span.glyphicon.glyphicon-chevron-left {:aria-hidden "true"}]
       [:span.sr-only "Previous"]]
      [:a.right.carousel-control {:href "#projectcarousel" :role "button"
                                  :data-slide "next"}
       [:span.glyphicon.glyphicon-chevron-right {:aria-hidden "true"}]
       [:span.sr-only "Next"]]]]))



(defn metalslide []
  (bootcar [{:image "images/metalheadworld1.png"
             :caption "Metalhead World and Item Class initialization"}
            {:image "images/metalheadworld2.png"
             :caption "Example of a Location object."}]))





(def work-experiences
  [
   {
    :company "Pfeiffer & May",
    :years  "2008 - 2012",
    :position  "Head of Heating Department",
    :worksummary "Supervising of team members. Negotiating prices and special deals with suppliers and customers. Developing weekly promotions for heating products. Determining of prices and conditions for our supplying of goods for bigger projects. Training and teaching of apprentices. Marketing of products utilising renewable energy. Compiling annual reports and goals for the following year."
    },
   {
    :company "Pfeiffer & May",
    :years   "1998 - 2006",
    :position  "Sales Team",
    :worksummary  "Supervising of team members. Handling of the demanding clients. Taking orders from our clients for daily deliveries. Making quick offers. Handling of complaints. Ordering of unusual products with our suppliers. Training and teaching of apprentices. Managing export business with customer in Taiwan, including handling of payment via letter of credit. Taking orders from our clients for daily or special deliveries. Inquiring of delivery dates. Handling of complaints. Ordering of goods with our suppliers by fax or telephone. Giving technical advise to our customers."
    },
   {
    :company "Pfeiffer & May",
    :years  "1995 - 1998",
    :position  "Apprenticeship",
    :worksummary  "Apprenticeship with Pfeiffer & May. Graduated as Wholesale and Foreign Trade merchant."
    }
   ]
  )

(defn workexp-element []
  [:div.workexpelement
   [:h3.sectionheader "Work Experience"]
   (for [i work-experiences]
     ^{:key i}
     [:div.workexp
      [:div.row
       [:div.small-5.large-5.columns
        [:h4 (:company i)]]
       [:div.position.small-6.columns
        [:h4 (:position i)]]]
      [:div.yearssummary.row
       [:div.years.small-3.columns
        [:p (:years i)]]
       [:div.summary.small-9.columns
        [:p (:worksummary i)]]]])])

(def educations
  [
   {
    :years "1993 - 1995",
    :schoolname "Berufskolleg II, Villingen-Schwenningen"
    }
   {
    :years "1984 - 1993",
    :schoolname "Gymnasium, Villingen-Schwenningen"
    }
   {
    :years "1980 - 1984",
    :schoolname "Elementary School, Villingen-Schwenningen"
    }])

(defn education-element []
  [:div.education
   [:h3.sectionheader "Education"]
   (for [i educations]
     ^{:key i}
     [:div.educontainer
      [:div.row
       [:div.years.small-4.large-3.columns
        [:p (:years i)]]
       [:div.school.small-8.large-7.columns
        [:p (:schoolname i)]]]])])

(def awards
  [{
    :year "2013"
    :name "Certificate of Awesome"
    :description "Certificate of Awesome, awarded for a notably superior achievement
                  in the Lisp in Summer Projects 2013 Programming competition."}])

(defn awards-element []
  [:div.awards
   [:h3.sectionheader "Awards"]
   (for [i awards]
     ^{:key i}
     [:div.awardcontainer.row
      [:div.years
       [:p.small-2.large-1.columns (:year i)]]
      [:div.small-10.large-10.columns.awarddesc
       [:p (:description i)]]])])

(def skills
  [
   {
    :subsection"Programming Languages",
    :skill ["Python","Go","Common Lisp", "Clojure",
               "Javascript","Haskell", "Elisp", ]
    },
   {
    :subsection"Web Development",
    :skill ["Html","CSS", "Javascript","Dart",
               "AngularJS", "ClojureScript"]
    },
   {
   :subsection "Other",
    :skill ["Linux", "Bash", "Latex", "Emacs", "Vim"]
    }
   ]
  )

(defn skill-label
  "wrap skill name in a foundation title"
  [name]
  [:span.label.round (str name)])

(defn skill-element []
  [:div.skillcontainer
   [:h3.sectionheader "Technical Skills"]
   (for [i skills]
     ^{:key i}
     [:div#skillsection.row
      [:div.skillheader.small-2.large-4.columns
       [:h6  (:subsection i)]]
      [:div.skills.small-8..large-7.columns
       (for [s (:skill i)]
         ^{:key s}
         (skill-label s))]])])
