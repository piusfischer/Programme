using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ball_movement : MonoBehaviour {

    Vector2 velocity;
    public Rigidbody2D Ball;
	// Use this for initialization
	void Start () {
    Ball = GetComponent<Rigidbody2D>();
    //Ball.useGravity = false;
        //Ball.MovePosition(new Vector2(0,0));
	}
    Vector2 transformforcey;
    Vector2 transformforcex;
    bool i = false;
    public float zeit = 0;
    // Update is called once per frame
    void Update () {
       
        if (Input.GetKeyDown("space"))
        {
            
            zeit += Time.realtimeSinceStartup;
            i = true;

           

        }
        if(i)
        
            if (Input.GetKeyUp("space"))
            {
                //Ball.useGravity = true;
                Ball.gravityScale = 1;
                //Ball.velocity = transform.right * (zeit*1000);
                transformforcey = new Vector2(zeit * 80, (zeit * 200) * 2 / 3);
                //transformforcex = transformforcey * 2 / 3;
                Ball.AddForce(transformforcey);
            }
        }
        


       


		
	}

