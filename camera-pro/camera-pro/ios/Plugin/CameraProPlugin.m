#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

CAP_PLUGIN(CAPCameraProPlugin, "CameraPro",
  CAP_PLUGIN_METHOD(getPhoto, CAPPluginReturnPromise);
  CAP_PLUGIN_METHOD(pickImages, CAPPluginReturnPromise);
  CAP_PLUGIN_METHOD(checkPermissions, CAPPluginReturnPromise);
  CAP_PLUGIN_METHOD(requestPermissions, CAPPluginReturnPromise);
)
