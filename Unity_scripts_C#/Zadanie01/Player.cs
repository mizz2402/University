using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Player : MonoBehaviour
{
    int score = 0;
    public bool isOnPortal = false;

    // Start is called before the first frame update
    void Start()
    {
        Debug.Log("Punkty: " + score);
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.T))
            Raycast();
    }

	private void OnCollisionEnter(Collision collision) {
        if (collision.gameObject.tag == "Obsticle")
            SceneManager.LoadScene(SceneManager.GetActiveScene().name);
        else if (collision.gameObject.tag == "Coin") {
            Destroy(collision.gameObject);
            score += 2;
            Debug.Log("Punkty: " + score);
        }
	}

	private void OnTriggerEnter(Collider other) {
        if (other.tag == "PortalTrigger")
            isOnPortal = true;
	}

	private void OnTriggerExit(Collider other) {
        if (other.tag == "PortalTrigger")
            isOnPortal = false;
	}

	void Raycast() {
        RaycastHit raycastHit;
        Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);

        if (Physics.Raycast(ray, out raycastHit, 5f))
            if (raycastHit.collider.gameObject.tag == "Portal") {
                Debug.Log(raycastHit.collider);
                EndGame();
            }
                
	}

    void EndGame() {
        if (score >= 8 && isOnPortal)
            Destroy(this.gameObject);
	}
}
