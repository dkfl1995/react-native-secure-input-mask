
import { NativeModules, requireNativeComponent } from 'react-native';

const SecuredTextInput = requireNativeComponent('RCTRNSecureMaskTextInput');

const SecureMaskTextInput = (props) => <SecuredTextInput {...props}/>;

export default SecureMaskTextInput;
