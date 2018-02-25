package ioio.examples.hello;

public enum Command {

    GET_FIRMWARE_VERSION((byte)0x81),
    GET_ERROR_BYTE((byte)0x82),
    GET_CONFIGURATION_PARAMETER((byte)0x83),
    SET_CONFIGURATION_PARAMETER((byte)0x84),

    AUTODETECT((byte)0xAA),

    MOTOR_M0_FORWARD((byte)0x88),
    MOTOR_M0_FORWARD_8_BIT((byte)0x89),
    MOTOR_M0_REVERSE((byte)0x8A),
    MOTOR_M0_REVERSE_8_BIT((byte)0x8B),
    MOTOR_M1_FORWARD((byte)0x8C),
    MOTOR_M1_FORWARD_8_BIT((byte)0x8D),
    MOTOR_M1_REVERSE((byte)0x8E),
    MOTOR_M1_REVERSE_8_BIT((byte)0x8F),

    MOTOR_M0_BRAKE((byte)0x86),
    MOTOR_M1_BRAKE((byte)0x87),
    GET_MOTOR_M0_CURRENT((byte)0x90),
    GET_MOTOR_M1_CURRENT((byte)0x91),
    GET_MOTOR_M0_SPEED((byte)0x92),
    GET_MOTOR_M1_SPEED((byte)0x93),

    CONFIG_DEVICE_ID((byte)0),
    CONFIG_PWM_PARAMETER((byte)1),
    CONFIG_SHUT_DOWN_MOTORS_ON_ERROR((byte)2),
    CONFIG_SERIAL_TIMEOUT((byte)3),
    CONFIG_MOTOR_M0_ACCELERATION((byte)4),
    CONFIG_MOTOR_M1_ACCELERATION((byte)5),
    CONFIG_MOTOR_M0_BRAKE_DURATION((byte)6),
    CONFIG_MOTOR_M1_BRAKE_DURATION((byte)7),
    CONFIG_MOTOR_M0_CURRENT_LIMIT_DIV_2((byte)8),
    CONFIG_MOTOR_M1_CURRENT_LIMIT_DIV_2((byte)9),
    CONFIG_MOTOR_M0_CURRENT_LIMIT_RESPONSE((byte)10),
    CONFIG_MOTOR_M1_CURRENT_LIMIT_RESPONSE((byte)11);

    private byte value;

    private Command(byte value) {
        this.value = value;
    }

    public byte getValue() {return value;}
}