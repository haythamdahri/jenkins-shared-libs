
// Execute ansible playbooks in a file with an inventory definitions
def executePlaybook(String playbooksFilename, String inventoryFilename) {
 echo "Running playbook ${playbooksFilename} with inventory file ${inventoryFilename}"
 sh "ansible-playbook ${playbooksFilename} -i ${inventoryFilename}"
}