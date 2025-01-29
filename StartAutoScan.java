package com.seape.BiometriaAPI.utils;

import com.nitgen.SDK.BSP.NBioBSPJNI;
import com.nitgen.SDK.BSP.NBioBSPJNI.CAPTURED_DATA;

public class StartAutoScan implements NBioBSPJNI.CAPTURE_CALLBACK {

	public static void main(String[] args) {
		new StartAutoScan().iniciarAuto();
	}

	private boolean autoScan = false;

	private NBioBSPJNI bsp;

	private NBioBSPJNI.WINDOW_OPTION windowOption;

	private NBioBSPJNI.FIR_HANDLE hCapturedFIR;

	private NBioBSPJNI.FIR_TEXTENCODE textSavedFIR;

	public boolean verificaDedo = true;;

	public void iniciarAuto() {
		bsp = new NBioBSPJNI();
		bsp.OpenDevice();

		autoScan = true;
		new Thread(new Runnable() {

			public void run() {

				while (autoScan) {

					Boolean bExistFinger = new Boolean(false);

					bsp.CheckFinger(bExistFinger);

					if (bExistFinger) {
						OnIdentify(5000);
						System.out.println("======>> Dedo Repousado !! <<======");
					} else
						System.out.println("________ Sem Dedo No Leitor _______");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}
		}).start();
	}

	private void OnIdentify(int timeout) {

		hCapturedFIR = bsp.new FIR_HANDLE();

		windowOption = bsp.new WINDOW_OPTION();
		windowOption.WindowStyle = NBioBSPJNI.WINDOW_STYLE.INVISIBLE;

		// Liga o LED ao iniciar a captura
		bsp.Capture(NBioBSPJNI.FIR_PURPOSE.VERIFY, hCapturedFIR, timeout, null, windowOption);
		if (bsp.IsErrorOccured() == false) {

			textSavedFIR = bsp.new FIR_TEXTENCODE();
			bsp.GetTextFIRFromHandle(hCapturedFIR, textSavedFIR);

			System.out.println("Digital Capturada: " + textSavedFIR.TextFIR);
		}

		// Desliga o LED após a captura
		// Não há necessidade de um método específico, o LED deve se desligar
		// automaticamente após a captura
	}

	@Override
	public int OnCaptured(CAPTURED_DATA captureData) {

		if (captureData.DeviceError != NBioBSPJNI.ERROR.NBioAPIERROR_NONE) {
			return 0;
		}

		return NBioBSPJNI.ERROR.NBioAPIERROR_NONE;
	}

}
