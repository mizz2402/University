using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;

public class Elevator : MonoBehaviour
{
    [SerializeField]
    Light light;
    [SerializeField]
    GameObject button;
    [SerializeField]
    KeyCode useButton = KeyCode.E;
    [SerializeField]
    float speed = 3f;
    [SerializeField]
    AudioClip[] voiceAnnouncements = new AudioClip[3];
    [SerializeField]
    TextMeshPro floorInfo;
    [SerializeField]
    GameObject elevatorInfo;
    [SerializeField]
    GameObject block;
    
    int floorIndex = 1;
    float[] floors = { 0f, 4f, 8f };
    Vector3 direction = Vector3.up;
    bool isMoveing = false;
    

    // Start is called before the first frame update
    void Start()
    {
        floorInfo.text = "Poziom: " + floorIndex;
        elevatorInfo.GetComponent<TextMeshProUGUI>().text = "Wyceluj w pomarañczowy przycisk i naciœnij klawisz [" + KeyCode.E.ToString() + "].";
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(useButton) && !isMoveing)
            Raycast();
        else if (isMoveing)
            MoveElevator();
    }


	private void OnTriggerEnter(Collider other) {
		if (other.tag == "Player") {
            light.enabled = true;
            other.gameObject.transform.SetParent(this.transform);
            elevatorInfo.active = true;
		}
	}

	private void OnTriggerExit(Collider other) {
		if (other.tag == "Player") {
            light.enabled = false;
            other.gameObject.transform.SetParent(null);
            elevatorInfo.active = false;
		}
	}

    void Raycast() {
        RaycastHit raycastHit;
        Ray ray = Camera.main.ViewportPointToRay(new Vector3(.5f, .5f, 0));

        if (Physics.Raycast(ray, out raycastHit, 2f))
            if (raycastHit.collider.gameObject == button)
                PickFloor();
	}

    void PickFloor() {
        if (floorIndex == 0) {
            floorIndex = 1;
            direction = Vector3.up;
        } else if (floorIndex == 1) {
            floorIndex = 0 + 2 * (Random.Range(0, 2));
            if (floorIndex == 0)
                direction = Vector3.down;
            else
                direction = Vector3.up;
        } else if (floorIndex == 2) {
            floorIndex = 1;
            direction = Vector3.down;
        }

        isMoveing = true;
    }

    void MoveElevator() {
        block.active = true;

        if (direction == Vector3.up) {
            if (transform.position.y < floors[floorIndex])
                transform.Translate(direction * speed * Time.deltaTime);
            else {
                EndElevatorMovement();
            }
        } else {
            if (transform.position.y > floors[floorIndex])
                transform.Translate(direction * speed * Time.deltaTime);
            else {
                EndElevatorMovement();
            }
        }
    }

    void EndElevatorMovement() {
        isMoveing = false;
        transform.position = new Vector3(transform.position.x, floors[floorIndex], transform.position.z);

        floorInfo.text = "Poziom: " + floorIndex;

        block.active = false;

        AudioSource audioSource = GetComponent<AudioSource>();
        audioSource.clip = voiceAnnouncements[floorIndex];
        audioSource.Play();
    }
}
