# osrs-android-port
Android Studio project with the intentions of replicating necessary java.awt usage and removing unnecessary native features in the android environment.  
  
This branch has gutted most of the native functionality in order to build and get to the login screen.  
Jagex cache is stored in External/Downloads/jagexcache.  

## Building  

This branch is buildable!  
Setup a virtual android device or use your own to launch com.opscape.openosrs.MainActivity  
It should open automatically on your device when ran. Then you can start osrs by clicking the mail button (placeholder)  
  
![screenshot1](https://i.imgur.com/wtb7fpH.jpg)
  
    
You can watch for debug output in the Android Studio Console.  
I've added some debug output for any file manipulation on storage, and gamestate updates, which looks like so:  
![screenshot2](https://i.imgur.com/hQqk8HN.png)
