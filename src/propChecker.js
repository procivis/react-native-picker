export function throwIfInvalidProps(props) {
  checks.forEach((check) => check.validate(props))
}

class PropCheck {
  constructor(isInvalid, errorText) {
    this.isInvalid = isInvalid
    this.errorText = errorText
  }
  validate = (props) => {
    if (this.isInvalid(props)) {
      throw new Error(
        `${this.errorText} Check usage of react-native-picker.`
      )
    }
  }
}

const dateCheck = new PropCheck(
  (props) => props && props.mode !== 'list' && !(props.date instanceof Date),
  'Invalid or missing Date prop. Must be a Date object.'
)

const itemsCheck = new PropCheck(
  (props) => props && props.mode === 'list' && !(Array.isArray(props.items)),
  'Invalid or missing items prop. Must be an array of strings.'
)

const widthCheck = new PropCheck(
  (props) =>
    props &&
    props.style &&
    props.style.width &&
    typeof props.style.width !== 'number',
  'Invalid style: width. Width needs to be a number. Percentages or other values are not supported.'
)

const heightCheck = new PropCheck(
  (props) =>
    props &&
    props.style &&
    props.style.height &&
    typeof props.style.height !== 'number',
  'Invalid style: height. Height needs to be a number. Percentages or other values are not supported.'
)

const modeCheck = new PropCheck(
  (props) =>
    props && props.mode && !['datetime', 'date', 'time', 'list'].includes(props.mode),
  "Invalid mode. Valid modes: 'datetime', 'date', 'time', 'list'"
)

const androidVariantCheck = new PropCheck(
  (props) =>
    props &&
    props.androidVariant &&
    !['nativeAndroid', 'iosClone'].includes(props.androidVariant),
  "Invalid android variant. Valid modes: 'nativeAndroid', 'iosClone'"
)

const themeCheck = new PropCheck(
  (props) =>
    props && props.theme && !['light', 'dark', 'auto'].includes(props.theme),
  "Invalid theme. Valid options: 'light', 'dark', 'auto'"
)

const checks = [
  dateCheck,
  itemsCheck,
  widthCheck,
  heightCheck,
  modeCheck,
  androidVariantCheck,
  themeCheck,
]
