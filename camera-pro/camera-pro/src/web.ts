import { WebPlugin } from '@capacitor/core';

import type { CameraProPlugin } from './definitions';

export class CameraProWeb extends WebPlugin implements CameraProPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
