using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Obsticle : MonoBehaviour
{
    float speed = 10f;
    Vector3 direction = Vector3.left;

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void FixedUpdate()
    {
        transform.Translate(direction * speed * Time.deltaTime);
    }
	private void OnCollisionEnter(Collision collision) {
        if (collision.gameObject.tag == "Wall")
            direction *= -1;
	}
}
