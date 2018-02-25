function main() {
	
	command = "";
    speed = 0x32;

    object L = M0;
    object R = M1;

    forwardButton -> click(forward())
    reverseButton -> click(reverse())
    leftButton -> click(turnLeft())
    rightButton -> click(turnRight())
    stopButton -> click(stop())

}

function checkSpeed() {
	
	if(speed == 0x32)
		done
	else
		speed = 0x32
}


function forward() {
	
	command = ACCELERATE;
	L(command,speed);
	R(command,speed);
}


function reverse() {
	
	command = REVERSE;
	L(command,speed);
	R(command,speed);
}


function leftButton() {
	
	command = REVERSE;
	L(command,speed);
	
	command = ACCELERATE;
	R(command,speed);
}


function rightButton() {
	
	command = ACCELERATE;
	L(command,speed);
	
	command = REVERSE;
	R(command,speed);
}


function stop() {
	
	command = BRAKE;
	L(command,speed);
	R(command,speed);
}
