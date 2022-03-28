using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MainMenu : MonoBehaviour
{
	private void Awake() {
		Cursor.visible = true;
		Cursor.lockState = CursorLockMode.None;
	}

	public void StartGame() {
		SceneManager.LoadScene(1);
	}

	public void QuitGame() {
		Debug.LogWarning("Quit");
		Application.Quit();
	}
}
