
# react-native-react-native-secure-input-mask

## Getting started

`$ npm install react-native-react-native-secure-input-mask --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-secure-input-mask`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-secure-input-mask` and add `RNReactNativeSecureInputMask.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeSecureInputMask.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeSecureInputMaskPackage;` to the imports at the top of the file
  - Add `new RNReactNativeSecureInputMaskPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-secure-input-mask'
  	project(':react-native-react-native-secure-input-mask').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-secure-input-mask/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-secure-input-mask')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeSecureInputMask.sln` in `node_modules/react-native-react-native-secure-input-mask/windows/RNReactNativeSecureInputMask.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Secure.Input.Mask.RNReactNativeSecureInputMask;` to the usings at the top of the file
  - Add `new RNReactNativeSecureInputMaskPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import SecureTextInput from 'react-native-react-native-secure-input-mask';

// TODO: What to do with the module?
<SecureTextInput {...props} maskChar={"^"} />;
```
  