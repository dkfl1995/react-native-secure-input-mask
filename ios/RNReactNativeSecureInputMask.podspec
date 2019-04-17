
Pod::Spec.new do |s|
  s.name         = "RNReactNativeSecureInputMask"
  s.version      = "0.1.0"
  s.summary      = "RNReactNativeSecureInputMask"
  s.description  = <<-DESC
                  RNReactNativeSecureInputMask
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "8.0"
  s.source       = { :git => "https://github.com/author/RNReactNativeSecureInputMask.git", :tag => "master" }
  s.source_files  = "RNReactNativeSecureInputMask/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  