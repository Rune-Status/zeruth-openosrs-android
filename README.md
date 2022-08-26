# osrs-android-port
Android Studio project with the intentions of replicating necessary java.awt usage in the android environment.
  
Current features:  
  
2D rendering  
Logging in (if you don't have authenticator)  
Reflection checks  
Partial touch support (coords are off still)  


## Building  

Setup a virtual android device or use your own to launch the ```app``` module  
(requirea api 28)

## Running  
  
Download https://drive.google.com/file/d/1dO2MDPgnji4miunefqYw_yRlojTymERv/view?usp=sharing and place ```jagexcache``` in STORAGE/Downloads  
This contains the 207.4 cache and classes for reflection checks  
  
Due to the lack of keyboard support, The client will automatically login using supplied username and password in MainActivity  
As mentioned, touch points are way off so you will have to experiment with the top left of the view to get past welcome screen  
  
## Why tho  
  
This is specifically targeting RSPS work, but will be maintained for the live game as long as possible  
  
## Contributing  
  
Please do.
