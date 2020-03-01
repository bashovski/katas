#!/bin/bash
nbYear() {
    population=$1
    percentage=$2
    iter=0
    while [[ $population -lt $4 ]]
    do
        iter=`expr $iter + 1`
        gain=$(awk -v population="$population" -v percentage="$percentage" -v gain="$3" 'BEGIN{print int(population / 100 * percentage + gain)}')
        population=`expr $population + $gain`
    done
    echo $iter
}
nbYear $1 $2 $3 $4