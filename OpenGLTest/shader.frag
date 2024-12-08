#version 430 core

layout(location = 0) uniform int ssboSize; // Size of the SSBO (number of elements)
layout(location = 3) uniform vec2 resolution;

layout(std430, binding = 2) buffer DataBuffer {
    float data[];
};

layout(location = 0) out vec4 fragColor;  // Output to the framebuffer


void main()
{
    vec2 coord = gl_FragCoord.xy/resolution;

    // Calculate SSBO index based on gl_FragCoord.x, ensure correct modulus
    
    int index = int(mod(abs(coord.x) * ssboSize, float(ssboSize)));

    // Compute the color based on gl_FragCoord.y and the SSBO data
    float myColor = abs( (coord.y-0.5) - 0.25*data[index]);

    myColor=1.0-clamp(myColor, 0.0, 1.0);
    

    myColor = step(0.99,myColor);
    
    // Optionally, clamp the color to ensure it's within the valid range [0.0, 1.0]
    fragColor = vec4(0, myColor , 0 , 1.0);
}
