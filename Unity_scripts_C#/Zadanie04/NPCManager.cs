using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class NPCManager : MonoBehaviour
{
    [SerializeField]
    int maxAgents = 10;
    int currentAgents = 0;
    [SerializeField]
    GameObject agentPrefab;
    [SerializeField]
    Transform spawnPoint;
    private IEnumerator coroutine;
    [SerializeField]
    float waitTime = 10f;
    [SerializeField]
    TextMeshProUGUI text;

    // Start is called before the first frame update
    void Start()
    {
        SpawnAgent();
        coroutine = WaitAndSpawn(waitTime);
        StartCoroutine(coroutine);
    }

    // Update is called once per frame
    void Update()
    {
        text.text = "Licznik graczy: " + currentAgents;
    }

    private IEnumerator WaitAndSpawn(float waitTime) {
        while(true) {
            yield return new WaitForSeconds(waitTime);
            SpawnAgent();
		}
	}

    void SpawnAgent() {
        if (currentAgents < maxAgents) {
            GameObject agent = Instantiate(agentPrefab);
            agent.transform.position = spawnPoint.transform.position;

            currentAgents++;
		}
    }
}
