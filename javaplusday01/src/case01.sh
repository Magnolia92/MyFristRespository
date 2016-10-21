#!/bin/sh

echo "please input Y(y) or N(n):"

read input
case $input in
	Y|y) echo "OK,continue"
		;;
	N|n) echo "OK,interrupt"
		;;
	*)  echo "I don't konw what your choice is"
esac
