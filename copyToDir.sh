for file in *.txt
do
   folderName=` echo $file | awk -F. '{print $1}'`;
   echo $folderName;
done
