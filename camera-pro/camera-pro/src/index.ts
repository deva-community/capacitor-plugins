import { registerPlugin } from '@capacitor/core';

import type { CameraProPlugin } from './definitions';

const CameraPro = registerPlugin<CameraProPlugin>('CameraPro', {
  web: () => import('./web').then(m => new m.CameraProWeb()),
});

export * from './definitions';
export { CameraPro };
