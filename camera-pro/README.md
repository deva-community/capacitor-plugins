# capacitor-camera-pro

The CameraPro API provides the ability to take a photo or video with the camera or choose an existing one from the photo album.

# Based on @capacitor/camera and inpired from:
https://github.com/apache/cordova-plugin-media-capture
https://github.com/danielsogl/cordova-plugin-video-capture-plus

## Install

```bash
npm install @deva-community/capacitor-camera-pro
npx cap sync
```

## API

<docgen-index>

* [`getPhoto(...)`](#getphoto)
* [`getVideo(...)`](#getvideo)
* [`pickImages(...)`](#pickimages)
* [`checkPermissions()`](#checkpermissions)
* [`requestPermissions(...)`](#requestpermissions)
* [Interfaces](#interfaces)
* [Type Aliases](#type-aliases)
* [Enums](#enums)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getPhoto(...)

```typescript
getPhoto(options: ImageOptions) => Promise<Photo>
```

Prompt the user to pick a photo from an album, or take a new photo
with the camera.

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code><a href="#imageoptions">ImageOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#photo">Photo</a>&gt;</code>

**Since:** 1.0.0

--------------------


### getVideo(...)

```typescript
getVideo(options: VideoOptions) => Promise<Video>
```

Prompt the user to pick a photo from an album, or take a new photo
with the camera.

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code><a href="#videooptions">VideoOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#video">Video</a>&gt;</code>

**Since:** 1.0.0

--------------------


### pickImages(...)

```typescript
pickImages(options: GalleryImageOptions) => Promise<GalleryPhotos>
```

Allows the user to pick multiple pictures from the photo gallery.
On iOS 13 and older it only allows to pick one picture.

| Param         | Type                                                                |
| ------------- | ------------------------------------------------------------------- |
| **`options`** | <code><a href="#galleryimageoptions">GalleryImageOptions</a></code> |

**Returns:** <code>Promise&lt;<a href="#galleryphotos">GalleryPhotos</a>&gt;</code>

**Since:** 1.2.0

--------------------


### checkPermissions()

```typescript
checkPermissions() => Promise<PermissionStatus>
```

Check camera and photo album permissions

**Returns:** <code>Promise&lt;<a href="#permissionstatus">PermissionStatus</a>&gt;</code>

**Since:** 1.0.0

--------------------


### requestPermissions(...)

```typescript
requestPermissions(permissions?: CameraProPluginPermissions | undefined) => Promise<PermissionStatus>
```

Request camera and photo album permissions

| Param             | Type                                                                              |
| ----------------- | --------------------------------------------------------------------------------- |
| **`permissions`** | <code><a href="#camerapropluginpermissions">CameraProPluginPermissions</a></code> |

**Returns:** <code>Promise&lt;<a href="#permissionstatus">PermissionStatus</a>&gt;</code>

**Since:** 1.0.0

--------------------


### Interfaces


#### Photo

| Prop               | Type                 | Description                                                                                                                                                                                                      | Since |
| ------------------ | -------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **`base64String`** | <code>string</code>  | The base64 encoded string representation of the image, if using <a href="#cameraresulttype">CameraResultType.Base64</a>.                                                                                         | 1.0.0 |
| **`dataUrl`**      | <code>string</code>  | The url starting with 'data:image/jpeg;base64,' and the base64 encoded string representation of the image, if using <a href="#cameraresulttype">CameraResultType.DataUrl</a>.                                    | 1.0.0 |
| **`path`**         | <code>string</code>  | If using <a href="#cameraresulttype">CameraResultType.Uri</a>, the path will contain a full, platform-specific file URL that can be read later using the Filsystem API.                                          | 1.0.0 |
| **`webPath`**      | <code>string</code>  | webPath returns a path that can be used to set the src attribute of an image for efficient loading and rendering.                                                                                                | 1.0.0 |
| **`exif`**         | <code>any</code>     | Exif data, if any, retrieved from the image                                                                                                                                                                      | 1.0.0 |
| **`format`**       | <code>string</code>  | The format of the image, ex: jpeg, png, gif. iOS and Android only support jpeg. Web supports jpeg and png. gif is only supported if using file input.                                                            | 1.0.0 |
| **`saved`**        | <code>boolean</code> | Whether if the image was saved to the gallery or not. On Android and iOS, saving to the gallery can fail if the user didn't grant the required permissions. On Web there is no gallery, so always returns false. | 1.1.0 |


#### ImageOptions

| Prop                      | Type                                                          | Description                                                                                                                                                                                                                                                            | Default                             | Since |
| ------------------------- | ------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------- | ----- |
| **`quality`**             | <code>number</code>                                           | The quality of image to return as JPEG, from 0-100                                                                                                                                                                                                                     |                                     | 1.0.0 |
| **`allowEditing`**        | <code>boolean</code>                                          | Whether to allow the user to crop or make small edits (platform specific). On iOS 14+ it's only supported for <a href="#camerasource">CameraSource.Camera</a>, but not for <a href="#camerasource">CameraSource.Photos</a>.                                            |                                     | 1.0.0 |
| **`resultType`**          | <code><a href="#cameraresulttype">CameraResultType</a></code> | How the data should be returned. Currently, only 'Base64', 'DataUrl' or 'Uri' is supported                                                                                                                                                                             |                                     | 1.0.0 |
| **`saveToGallery`**       | <code>boolean</code>                                          | Whether to save the photo to the gallery. If the photo was picked from the gallery, it will only be saved if edited.                                                                                                                                                   | <code>: false</code>                | 1.0.0 |
| **`width`**               | <code>number</code>                                           | The width of the saved image                                                                                                                                                                                                                                           |                                     | 1.0.0 |
| **`height`**              | <code>number</code>                                           | The height of the saved image                                                                                                                                                                                                                                          |                                     | 1.0.0 |
| **`preserveAspectRatio`** | <code>boolean</code>                                          | This setting has no effect. Picture resizing always preserve aspect ratio.                                                                                                                                                                                             |                                     | 1.0.0 |
| **`correctOrientation`**  | <code>boolean</code>                                          | Whether to automatically rotate the image "up" to correct for orientation in portrait mode                                                                                                                                                                             | <code>: true</code>                 | 1.0.0 |
| **`source`**              | <code><a href="#camerasource">CameraSource</a></code>         | The source to get the photo from. By default this prompts the user to select either the photo album or take a photo.                                                                                                                                                   | <code>: CameraSource.Prompt</code>  | 1.0.0 |
| **`direction`**           | <code><a href="#cameradirection">CameraDirection</a></code>   | iOS and Web only: The camera direction.                                                                                                                                                                                                                                | <code>: CameraDirection.Rear</code> | 1.0.0 |
| **`presentationStyle`**   | <code>'fullscreen' \| 'popover'</code>                        | iOS only: The presentation style of the Camera.                                                                                                                                                                                                                        | <code>: 'fullscreen'</code>         | 1.0.0 |
| **`webUseInput`**         | <code>boolean</code>                                          | Web only: Whether to use the PWA Element experience or file input. The default is to use PWA Elements if installed and fall back to file input. To always use file input, set this to `true`. Learn more about PWA Elements: https://capacitorjs.com/docs/pwa-elements |                                     | 1.0.0 |
| **`promptLabelHeader`**   | <code>string</code>                                           | Text value to use when displaying the prompt.                                                                                                                                                                                                                          | <code>: 'Photo'</code>              | 1.0.0 |
| **`promptLabelCancel`**   | <code>string</code>                                           | Text value to use when displaying the prompt. iOS only: The label of the 'cancel' button.                                                                                                                                                                              | <code>: 'Cancel'</code>             | 1.0.0 |
| **`promptLabelPhoto`**    | <code>string</code>                                           | Text value to use when displaying the prompt. The label of the button to select a saved image.                                                                                                                                                                         | <code>: 'From Photos'</code>        | 1.0.0 |
| **`promptLabelPicture`**  | <code>string</code>                                           | Text value to use when displaying the prompt. The label of the button to open the camera.                                                                                                                                                                              | <code>: 'Take Picture'</code>       | 1.0.0 |


#### Video

| Prop          | Type                 | Description                                                                                                                                                                                                      | Since |
| ------------- | -------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **`path`**    | <code>string</code>  | If using <a href="#cameraresulttype">CameraResultType.Uri</a>, the path will contain a full, platform-specific file URL that can be read later using the Filsystem API.                                          | 1.0.0 |
| **`webPath`** | <code>string</code>  | webPath returns a path that can be used to set the src attribute of an video for efficient loading and rendering.                                                                                                | 1.2.0 |
| **`format`**  | <code>string</code>  | The format of the video, ex: mp4, 3gp.                                                                                                                                                                           | 1.0.0 |
| **`saved`**   | <code>boolean</code> | Whether if the video was saved to the gallery or not. On Android and iOS, saving to the gallery can fail if the user didn't grant the required permissions. On Web there is no gallery, so always returns false. | 1.1.0 |


#### VideoOptions

| Prop                     | Type                                                            | Description                                                                                                          | Default                                 | Since |
| ------------------------ | --------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | --------------------------------------- | ----- |
| **`saveToGallery`**      | <code>boolean</code>                                            | Whether to save the video to the gallery. If the video was picked from the gallery, it will only be saved if edited. | <code>: false</code>                    | 1.0.0 |
| **`duration`**           | <code>number</code>                                             | The maximum duration of the video in seconds.                                                                        | <code>0 (unlimited)</code>              | 1.0.0 |
| **`highquality`**        | <code>boolean</code>                                            | Set to true to override the default low quality setting                                                              |                                         | 1.0.0 |
| **`source`**             | <code><a href="#cameravideosource">CameraVideoSource</a></code> | The source to get the video from. By default this prompts the user to select either the library or take a video.     | <code>: CameraVideoSource.Prompt</code> | 1.0.0 |
| **`promptLabelHeader`**  | <code>string</code>                                             | Text value to use when displaying the prompt.                                                                        | <code>: 'Video'</code>                  | 1.0.0 |
| **`promptLabelCancel`**  | <code>string</code>                                             | Text value to use when displaying the prompt. iOS only: The label of the 'cancel' button.                            | <code>: 'Cancel'</code>                 | 1.0.0 |
| **`promptLabelLibrary`** | <code>string</code>                                             | Text value to use when displaying the prompt. The label of the button to select a saved image.                       | <code>: 'From Library'</code>           | 1.0.0 |
| **`promptLabelVideo`**   | <code>string</code>                                             | Text value to use when displaying the prompt. The label of the button to open the camera.                            | <code>: 'Take Video'</code>             | 1.0.0 |


#### GalleryPhotos

| Prop         | Type                        | Description                     | Since |
| ------------ | --------------------------- | ------------------------------- | ----- |
| **`photos`** | <code>GalleryPhoto[]</code> | Array of all the picked photos. | 1.2.0 |


#### GalleryPhoto

| Prop          | Type                | Description                                                                                                       | Since |
| ------------- | ------------------- | ----------------------------------------------------------------------------------------------------------------- | ----- |
| **`path`**    | <code>string</code> | Full, platform-specific file URL that can be read later using the Filsystem API.                                  | 1.2.0 |
| **`webPath`** | <code>string</code> | webPath returns a path that can be used to set the src attribute of an image for efficient loading and rendering. | 1.2.0 |
| **`exif`**    | <code>any</code>    | Exif data, if any, retrieved from the image                                                                       | 1.2.0 |
| **`format`**  | <code>string</code> | The format of the image, ex: jpeg, png, gif. iOS and Android only support jpeg. Web supports jpeg, png and gif.   | 1.2.0 |


#### GalleryImageOptions

| Prop                     | Type                                   | Description                                                                                | Default                     | Since |
| ------------------------ | -------------------------------------- | ------------------------------------------------------------------------------------------ | --------------------------- | ----- |
| **`quality`**            | <code>number</code>                    | The quality of image to return as JPEG, from 0-100                                         |                             | 1.2.0 |
| **`width`**              | <code>number</code>                    | The width of the saved image                                                               |                             | 1.2.0 |
| **`height`**             | <code>number</code>                    | The height of the saved image                                                              |                             | 1.2.0 |
| **`correctOrientation`** | <code>boolean</code>                   | Whether to automatically rotate the image "up" to correct for orientation in portrait mode | <code>: true</code>         | 1.2.0 |
| **`presentationStyle`**  | <code>'fullscreen' \| 'popover'</code> | iOS only: The presentation style of the Camera.                                            | <code>: 'fullscreen'</code> | 1.2.0 |
| **`limit`**              | <code>number</code>                    | iOS only: Maximum number of pictures the user will be able to choose.                      | <code>0 (unlimited)</code>  | 1.2.0 |


#### PermissionStatus

| Prop         | Type                                                                          |
| ------------ | ----------------------------------------------------------------------------- |
| **`camera`** | <code><a href="#camerapropermissionstate">CameraProPermissionState</a></code> |
| **`photos`** | <code><a href="#camerapropermissionstate">CameraProPermissionState</a></code> |


#### CameraProPluginPermissions

| Prop              | Type                                   |
| ----------------- | -------------------------------------- |
| **`permissions`** | <code>CameraProPermissionType[]</code> |


### Type Aliases


#### CameraProPermissionState

<code><a href="#permissionstate">PermissionState</a> | 'limited'</code>


#### PermissionState

<code>'prompt' | 'prompt-with-rationale' | 'granted' | 'denied'</code>


#### CameraProPermissionType

<code>'camera' | 'photos'</code>


### Enums


#### CameraResultType

| Members       | Value                  |
| ------------- | ---------------------- |
| **`Uri`**     | <code>'uri'</code>     |
| **`Base64`**  | <code>'base64'</code>  |
| **`DataUrl`** | <code>'dataUrl'</code> |


#### CameraSource

| Members      | Value                 | Description                                                        |
| ------------ | --------------------- | ------------------------------------------------------------------ |
| **`Prompt`** | <code>'PROMPT'</code> | Prompts the user to select either the photo album or take a photo. |
| **`Camera`** | <code>'CAMERA'</code> | Take a new photo using the camera.                                 |
| **`Photos`** | <code>'PHOTOS'</code> | Pick an existing photo fron the gallery or photo album.            |


#### CameraDirection

| Members     | Value                |
| ----------- | -------------------- |
| **`Rear`**  | <code>'REAR'</code>  |
| **`Front`** | <code>'FRONT'</code> |


#### CameraVideoSource

| Members       | Value                  | Description                                                        |
| ------------- | ---------------------- | ------------------------------------------------------------------ |
| **`Prompt`**  | <code>'PROMPT'</code>  | Prompts the user to select either the photo album or take a photo. |
| **`Camera`**  | <code>'CAMERA'</code>  | Take a new photo using the camera.                                 |
| **`Library`** | <code>'LIBRARY'</code> | Pick an existing photo fron the gallery or photo album.            |

</docgen-api>
