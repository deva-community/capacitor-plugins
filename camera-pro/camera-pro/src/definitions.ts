export interface CameraProPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
