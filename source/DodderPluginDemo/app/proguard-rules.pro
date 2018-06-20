
-repackageclasses 'com.dodder.box.plugin.demo'

-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose
-optimizations code/removal/simple,code/removal/advanced
-ignorewarnings

-keep public class * extends android.view.View
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.preference.Preference

-keep class android.** {*;}

-assumenosideeffects class android.util.Log { public *; }

-keep public class * extends com.dodder.box.p.Plugin

-keepclassmembers class * {    native <methods>;}

