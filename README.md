# ActionsheetDailog

[![API](https://img.shields.io/badge/API-16%2B-red.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![](https://jitpack.io/v/mkhoiron/Actionsheet-android.svg)](https://jitpack.io/#mkhoiron/Actionsheet-android/4)

ActionsheetDailog-android is an Android Library to build Actionsheet like iOS UIActionSheet component, iOS7 style, custom color etc.

<img src="https://raw.githubusercontent.com/premsingh8171/ActionsheetDailog/master/app/src/main/res/drawable/action1.jpeg" width="300" height="550" /> <img src="https://raw.githubusercontent.com/premsingh8171/ActionsheetDailog/master/app/src/main/res/drawable/action2.jpeg" width="300" height="550" />

## Installation

-  Add the following to your project level `build.gradle`:
 
```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
  -  Add this to your app `build.gradle`:
 
```gradle
dependencies {
      
      implementation 'com.github.premsingh8171:ActionsheetDailog:2.0.0'
}
```

## Using Java

```java
ArrayList<String> actionsList = new ArrayList<>();

        actionsList.add("Upload");
        actionsList.add("View");
        actionsList.add("Delete");
        actionsList.add("Move");
        actionsList.add("Duplicate");

new ActionSheet(MainActivityJava.this,actionsList)
                        .setTitle("What do you want to do with the file")
                        .setCancelTitle("Cancel")
                        .setColorTitle(getResources().getColor(R.color.title))
                        .setColorTitleCancel(getResources().getColor(R.color.action))
                        .setColorData(getResources().getColor(R.color.action))
                        .create(new ActionSheetCallBack() {
                            @Override
                            public void data(@NotNull String data, int position) {
                                switch (position){
                                    case 0:
                                        // your action
                                        break;
                                    case 1:
                                        // your action
                                        break;
                                    case 2:
                                        // your action
                                        break;
                                    case 3:
                                        // your action
                                        break;
                                    case 4:
                                       // your action
                                       break;
                                }
                            }
                        });
```
  -  In Kotlin
```kotlin
val actionsList by lazy { ArrayList<String>() }

        actionsList.add("Upload");
        actionsList.add("View");
        actionsList.add("Delete");
        actionsList.add("Move");
        actionsList.add("Duplicate");

ActionSheet(this, actionsList)
                   .setTitle("Select Country")
                   .setCancelTitle("Cancel")
                   .setColorTitleCancel(Color.parseColor("#FF4081"))
                   .setColorTitle(Color.parseColor("#FF4081"))
                   .setColorData(Color.parseColor("#FF4081"))
                   .create(object :ActionSheetCallBack{
                       override fun data(data: String, position: Int) {
                           if ("Upload".equals(data)){
                               // your action
                           }else if("Move".equals(data)){
                               // your action
                           }
                           setToast(data)
                       }
                   })
```
  
## With variable

  -  Initialize variable:
```java
ActionSheet actionSheet;

actionSheet = new ActionSheet(MainActivityJava.this, actionsList)
                        .setTitle("What do you want to do with the file")
                        .setCancelTitle("Cancel")
                        .setColorTitle(getResources().getColor(R.color.title))
                        .setColorTitleCancel(getResources().getColor(R.color.action))
                        .setColorData(getResources().getColor(R.color.action));
                        
actionSheet.create(new ActionSheetCallBack() {
                    @Override
                    public void data(@NotNull String data, int position) {
                        // switch or if handle
                    }
                });
```
## update feature

Function      				   | description
-------------------------------------------| -------------
.hideTitle()  			           | hide title
.setFontData(R.font.meryana_script)        | change font data
.setFontCancelTitle(R.font.meryana_script) | change font cancel
.setFontTitle(R.font.meryana_script)       | change font title
.setSizeTextCancel(30)			   | change size text cancel
.setSizeTextData(30)		           | change size text data
.setSizeTextTitle(30)		 	   | change size text title



<h2>Created and maintained by:</h2>
<p>Er.Prem singh daksha  premsingh8171@gmail.com</p>
<p><a href="https://www.linkedin.com/in/prem-singh-daksha-82az/"> <img src="https://github.com/anitaa1990/DeviceInfo-Sample/blob/master/media/linkedin-icon.png" alt="Linkedin" style="max-width:100%;"> </a></p>
