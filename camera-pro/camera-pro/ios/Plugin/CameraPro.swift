import Foundation

@objc public class CameraPro: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
