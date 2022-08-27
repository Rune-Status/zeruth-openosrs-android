# osrs-android-port  
Android Studio project with the intentions of replicating necessary java.awt usage in the android environment.  
  
Current features:  
  
Full rendering  
Logging in / world interacting   
Reflection checks (required for jagex to not input block you)  
Partial touch support (coords are off still)  
  
## Building  
  
Setup a virtual android device or use your own to launch the ```app``` module  
(requirea api 28)  
  
## Running  
  
Download the current cache (207.4?) from ```https://archive.runestats.com/``` and extract to your Downloads/jagexcache folder  
  
Currently you have to also copy built classes from  
```app/build/intermediates/javac/debug/classes/osrs``` to your Downloads/jagexcache/ReflectionClasses/ folder  
(This will be fixed asap)  
  
Due to the lack of keyboard support, The client will automatically login using supplied username and password in MainActivity  
As mentioned, touch points are way off so you will have to experiment with the top right of the view to get past welcome screen  
  
## Why tho  
  
This is specifically targeting RSPS work, but will be maintained for the live game as long as possible  
  
## Contributing  
  
Please do.
