###############################################an##########################
# File Name: flaskInstall.sh
# Author: chenwen
# mail: 476124923@qq.com
# Created Time: 2015年01月10日 星期六 13时33分03秒
#########################################################################
#!/bin/bash
sudo apt-get install python-pip
sudo pip install virtualenv
mkdir TianBo
cd TianBo
virtualenv venv
. venv/bin/activate
sudo pip install Flask
