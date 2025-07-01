int missingNumber(int* nums, int numsSize) {
    
    int xor1 = 0, xor2 = 0;

    for(int i=0; i<numsSize; i++){
        xor1 = xor1^nums[i];
        xor2 = xor2^(i+1);
    }

    return xor1^xor2;
}