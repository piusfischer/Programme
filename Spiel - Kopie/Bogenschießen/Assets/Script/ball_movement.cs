using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ball_movement : MonoBehaviour {


    public Rigidbody Ball;
	// Use this for initialization
	void Start () {

        
        Ball.MovePosition(new Vector3(0,0,0));
	}

    
	// Update is called once per frame
	void Update () {
        float zeit = 0;
        if (Input.GetKeyDown("space"))
        {
            if(Input.GetKeyUp("space"))
            {
                Ball.useGravity = true;
                Ball.velocity = transform.forward * (zeit*10);
            }
            else
            {
                zeit += Time.deltaTime;
            }
           
        }
        


       


		
	}
}
