#!/bin/bash

current_dir=$( pwd )

new_alias="alias cubix='python3 $current_dir/main.py'"

echo $new_alias >> ~/.bashrc
