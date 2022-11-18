require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = "react-native-picker"
  s.version      = package['version']
  s.summary      = "React Native Date Picker component for Android and iOS"

  s.authors      = { "henninghall" => "henning.hall@hotmail.com" }
  s.homepage     = "https://gitlab.procivis.ch/procivis/components/react-native-picker"
  s.license      = package['license']
  s.platform     = :ios, "8.0"

  s.source       = { :git => "git@gitlab.procivis.ch:procivis/components/react-native-picker.git" }
  s.source_files  = "ios/RNDatePicker/*.{h,m}"

  s.dependency 'React-Core'
end
