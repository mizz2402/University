using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;

public class NPC : MonoBehaviour
{
    GameObject[] targets;
    [SerializeField]
    Transform destination;
    Transform previousDestination;

    bool isTraveling = false;
    bool isWaiting = false;
    [SerializeField]
    float waitTime = 1f;
    float timer = 0f;

    NavMeshAgent _navMeshAgent;

    // Start is called before the first frame update
    void Start()
    {
        _navMeshAgent = this.GetComponent<NavMeshAgent>();

        targets = GameObject.FindGameObjectsWithTag("Target");

        SetDestination();
    }

	private void Update() {
		if (isTraveling && _navMeshAgent.remainingDistance <= 1.0f) {
            isTraveling = false;
            isWaiting = true;
            
		}

        if (isWaiting) {
            timer += Time.deltaTime;
            if (timer >= waitTime) {
                isWaiting = false;
                timer = 0f;
                SetDestination();
            }
        }
	}

	private void SetDestination() {
        previousDestination = destination;

        do {
            destination = targets[UnityEngine.Random.Range(0, targets.Length)].transform;
		} while (destination == previousDestination);

		if (destination != null) {
            Vector3 targetVector = destination.transform.position;
            _navMeshAgent.SetDestination(targetVector);
		}

        isTraveling = true;
	}
}
